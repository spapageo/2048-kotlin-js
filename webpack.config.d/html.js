config.module.rules.push({
    test: /\.html$/,
    loader: 'file-loader?name=[path][name].[ext]'
});