#!/bin/sh
docker run --name=speeder debian
docker inspect speeder | grep IPAddress 