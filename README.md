# scaltara-todo #

TODO application with scala and scalatra

## Build & Run ##

```sh
$ cd scaltara-todo
$ ./sbt
> container:start
> browse
```
To set container to scan for changes start it with following

```sh
$ cd scaltara-todo
$ ./sbt
> ~;container:start; container:reload /
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

