var path = require('path');

module.exports = {
    entry: './src/app.js',
    devtool: 'sourcemaps',
    cache: true,
    debug: true,
    output: {
        path: path.resolve(__dirname, "dist"),
        filename: 'bundle.js'
    },
    module: {
        loaders: [
            {
                test: path.join(__dirname, '.'),
                loader: "babel", 
                query: {presets:['react','es2015']}
            },
            {
            	test: /\.css$/, 
            	loader: "bless"
            }
        ]
    }
};