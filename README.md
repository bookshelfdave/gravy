gravy
=====

A language for describing Riak CRDT modifications. Once this works, I'll translate to leex/yecc.



```
map {
	counter gold++
	counter stone++

	set weapons {
		counter x++
	}

	map foo {
		map bar {
			counter baz++
		}
	}
}
```

```
map (
	counter gold++
	counter stone++

	set weapons (
		counter x++,
		"Halberd",
		knowledge
	)

	map foo (
		map bar (
			counter baz
		)
	)
)
```

```
update map {
	increment counter gold by 100,
	increment counter stone by 50,
	update set weapons {
		add "Halberd"
	}
	update set friends {
		add dave,
		add brian
	}
	update map foo {
		add counter bar
		update map foo_child {
			add counter baz
		}
	}
}
```
