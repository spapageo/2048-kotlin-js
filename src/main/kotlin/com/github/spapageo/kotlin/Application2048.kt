package com.github.spapageo.kotlin

import runtime.wrappers.require

/**
 * This is required for the index file to be copied to the double output folder.
 */
@Suppress("UNUSED")
private val indexFilePath = require("./index.html")

fun main(args: Array<String>) {
    console.log("Hello world!")
}

