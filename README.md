# Echo Server #
This app is a REST-based server created to echo the request input back to the calling application.  

## Usage ##
Once running in a web server, execute a GET command of the following form: &lt;path-to-server&gt;/echo?value=&lt;your-echo-value-here&gt;.  The response body should contain only the value you sent.  
There is also a JSON-based implementation.  Use a URL of the form: &lt;path-to-server&gt;/echo/json?value=&lt;your-echo-value-here&gt;.  It will return a JSON representation of the value posted.