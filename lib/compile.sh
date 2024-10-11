#!/usr/bin/zsh
  echo "Compilling utils.c to utils.o"
  gcc -c utils.c
  #check if gcc ended well
  if [ $? -ne 0 ]; then # '$?' the output of the last commnad
    echo "Compilation failed!"
    exit 1
  else
    echo "Compiled succesful\n"
    echo "Archiving utils.o to libutils.a"
    ar rcs libutils.a utils.o
    if [ $? -ne 0 ]; then
      echo "Archiving failed!"
      exit 1
    else
      echo "Succesful archivation\n"
      echo "Library is ready to use!"
    fi
  fi

  
