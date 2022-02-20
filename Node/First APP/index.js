const http = require('http');

const server = http.createServer(
    (req, res)=>
    {
        const url = req.url;

        res.setHeader('Content-Type', 'text/html');
        res.write('<html>' + '<h1>hi my name is sahan</h1>' +
            '</html>');
        res.end();
    }

).listen(8000);
