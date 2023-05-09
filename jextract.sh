#!/bin/sh

rm -rf src/main/java/me/eigenraven/sdl2panama

jextract --source \
  --output src/main/java \
  --target-package me.eigenraven.sdl2panama \
  --include-dir ./native/include \
  --library SDL2 \
  --header-class-name SDL2 \
  @./native/includes.txt \
  ./native/proxy.h
