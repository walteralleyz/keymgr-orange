package br.com.zup.utils

fun messageExtractor(message: String): String {
    if(message.contains(",")) {
        return message.split(",").joinToString(separator = ",") { m ->
            val index = m.lastIndexOf(".") + 1
            m.substring(index)
        }
    }

    return message.substring(message.lastIndexOf(".") + 1)
}