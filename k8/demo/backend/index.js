var http = require('http')
const os = require('os')

http.createServer((req, res) => {
    var url = req.url;
    res.setHeader('Content-Type', 'application/json')
    res.setHeader('Second', 'true')
    res.setHeader('Etag', 'true')
    res.setHeader('Date', new Date().toISOString())
    res.setHeader('Cache-Control', 'public')
    res.write(JSON.stringify({'message': "Hello world"}))
    res.end()
}).listen(5000,()=>console.log("action"))