package ru.hse.ezh.commands

import ru.hse.ezh.Command
import ru.hse.ezh.Environment
import java.io.InputStream
import java.io.OutputStream

class PwdCommand(args: List<String>) : Command(args) {
    override fun execute(input: InputStream, out: OutputStream, err: OutputStream, env: Environment): Int {
        TODO("Not yet implemented")
    }
}
