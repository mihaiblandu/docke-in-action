#!/bin/sh
#--interactive is interactive
sudo docker run --interactive --tty \
--link web:web \
--name web_test \
busybox:latest /bin/sh