package com.staticvoid.redtech

import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MOD_NAME = "Redtech"
const val MOD_ID = "redtech"
const val MOD_VERSION = "1.0.0-alpha.1"

val logger: Logger = LoggerFactory.getLogger(MOD_NAME)

fun init() {
    logger.info("$MOD_NAME version $MOD_VERSION has been initialized.")
}

fun initClient() {

}