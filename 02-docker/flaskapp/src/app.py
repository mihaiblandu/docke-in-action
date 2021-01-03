from flask import Flask

import socket

docker_short_id = socket.gethostname()

server = Flask(__name__)

@server.route("/")
def hello():
   return "<h1>Flask Instance : " + docker_short_id + "!</h1>"

if __name__ == "__main__":
   server.run(host='0.0.0.0')