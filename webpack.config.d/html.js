var HtmlWebpackPlugin = require('html-webpack-plugin');

config.plugins.push(new HtmlWebpackPlugin({
    hash: true,
    filename: 'index.html',
    template: __dirname + '/dist/html/index.html'
}));