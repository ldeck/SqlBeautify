# SqlBeautify

Java, shell and emacs tool to beautify sql from stdin via [igapyon/blancoSqlFormatter.git](https://github.com/igapyon/blancoSqlFormatter).

# Installation

Download the repo, cd into it, and build the jar into `lib/SqlBeautify-*.jar`.

``` bash
git clone git@github.com:ldeck/SqlBeautify.git
cd SqlBeautify
ant
```

# Usage

``` text
Usage: bin/beautify-sql < <stdin>
```

#Examples:

``` bash
$ echo "select * from foo;" | bin/beautify-sql
SELECT
        *
    FROM
        foo
;
```

## Thanks

These tools are inspired by https://www.emacswiki.org/emacs/SqlBeautify.
