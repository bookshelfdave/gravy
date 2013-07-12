grammar Gravy;

/*
 * -------------------------------------------------------------------
 *
 *   Copyright (c) 2013 Dave Parfitt
 *
 *   This file is provided to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License.  You may obtain
 *   a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 * -------------------------------------------------------------------
 */


crdt_command: crdt_initializer | crdt_scope;

crdt_scope: LCURLY
                cmds+=crdt_scope_command (COMMA cmds+=crdt_scope_command)*
            RCURLY;

crdt_scope_command: crdt_add_type |
                    crdt_incdec_counter;

crdt_add_type: ADD crdt_type ID;

crdt_incdec_counter: (INCREMENT | DECREMENT) TYPE_COUNTER ID BY INT;

crdt_initializer: crdt_type LPAREN (ID | STRING )? RPAREN;

crdt_type:    TYPE_SET
            | TYPE_COUNTER
            | TYPE_LWW
            | TYPE_MAP;

TYPE_SET        :      'set';
TYPE_COUNTER    :      'counter';
TYPE_LWW        :      'register';
TYPE_MAP        :      'map';

BY              :      'by';
ADD             :      'add';
UPDATE          :      'update';
INCREMENT       :      'increment';
DECREMENT       :      'decrement';

LCURLY      : '{';
RCURLY      : '}';
LPAREN      : '(';
RPAREN      : ')';
COMMA       : ',';
DOT         : '.';

ID          :       [A-Za-z_0-9]+;


INT         :   DIGIT+;
FLOAT       :   DIGIT+ DOT DIGIT*
            | DOT DIGIT+
         ;
fragment DIGIT  : '0' .. '9';


STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

LINE_COMMENT  : '%' .*? '\r'? '\n' -> skip ;

WS      :       [ \t\r\n]+ -> skip;