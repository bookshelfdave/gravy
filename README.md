gravy
=====

A language for describing Riak CRDT modifications. Once this works, I'll translate to leex/yecc.



```
map {
	counter gold++
	counter stone--

	set weapons {
		mace,
		sword,
		knowledge,
		"warm beer"
	}

	map foo {
		map bar {
			counter baz++
		}
	}
}
```

```
.gold                // get the current value of gold
.weapons             // returns the whole set
.weapons.mace?       // does mace exist in the set?
.foo.bar.*           // returns baz and z
.gold, .foo.bar.baz  // return multiple values from one query (comma sep)
.foo.bar.baz         // returns value of baz
.foo.bar?            // does foo contain the key bar?
.* return everything
```