from flask import Flask, render_template
import os
app = Flask(__name__)

#「/」へアクセスがあった場合に、"Hello World"の文字列を返す
@app.route("/")
def hello():
    return "Hello World"

#「/index」へアクセスがあった場合に、「index.html」を返す
@app.route("/index")
def index():
    return render_template("./../template/index.html")

if __name__ == "__main__":
    port = os.environ.get('WEB_API_PORT')
    if port != None: #読み取れなかった場合
        app.run(debug=True, host='0.0.0.0', port=port)

