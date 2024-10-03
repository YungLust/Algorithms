#!/usr/bin/zsh
if [ -n "$1" ]; then
  echo "compilling $1.c"
  gcc -Werror -I ./lib ./src/$1.c -L ./lib -l utils -o ./out/$1
else
  echo "Put the name of the file!"
fi
