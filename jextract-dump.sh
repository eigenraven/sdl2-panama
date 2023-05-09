#!/bin/sh

jextract --source \
  --output src/main/java \
  --target-package me.eigenraven.sdl2panama \
  --include-dir ./native/include \
  --library SDL2 \
  --header-class-name SDL2 \
  --dump-includes ./native/all-includes.txt \
  ./native/proxy.h
