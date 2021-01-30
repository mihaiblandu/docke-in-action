#!/bin/sh
minikube version
#Start the cluster, by running the minikube start command:
minikube start --driver=docker
#Details of the cluster and its health status can be discovered via
kubectl cluster-info
#To view the nodes in the cluster using 
kubectl get nodes

kubectl create deployment \
first-deployment \
--image=katacoda/docker-http-server

#list pods
kubectl get pods
kubectl expose deployment first-deployment \
--port=80 --type=NodePort