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