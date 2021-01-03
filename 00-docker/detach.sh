#!/bin/sh
#--detach is daemon
sudo docker run --detach --name web -p 80:80 nginx:latest 