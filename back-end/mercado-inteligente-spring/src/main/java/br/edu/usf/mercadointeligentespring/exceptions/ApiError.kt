package br.edu.usf.exceptions

data class ApiError (
    private val error: String,
    private val message: String,
    private val status: Int
)