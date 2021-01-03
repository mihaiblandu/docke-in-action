#!/bin/sh
#--detach is daemon

sudo docker-compose build
sudo docker-compose up --scale java-app=1 --scale flask-app=1 --scale node-app=1 