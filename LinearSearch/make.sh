#!/usr/bin/zsh
if [ -n "$1" ]; then
  echo "Compilling $1.c"
  gcc -Werror -I ./lib ./src/$1.c -L ./lib -l utils -o ./out/$1
  #check if gcc ended well
  if [ $? -ne 0 ]; then # '$?' the output of the last commnad
    echo "Compilation failed!"
    exit 1
  else
    echo "Compiled succesful"
    if [ "$2" = "-t" ]; then
      echo "Starting & timing the file out/$1"
      time out/./$1
    else
      echo "Starting the file out/$1"
      out/./$1
    fi
  fi

  
else
  echo "Put the name of the file!"
fi
