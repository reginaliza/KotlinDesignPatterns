package behavioralPattern.template

fun main(args: Array<String>) {
    var music: Music = WesternMusic()
    println(music.myMusic())

}

abstract class Music {

    var music : String = ""
    abstract fun inititialize()
    abstract fun play()
    abstract fun stop()

    fun myMusic() : String {

        inititialize()

        play()

        stop()

        return music
    }
}

class PinoyMusic() : Music() {

    override fun inititialize() {
        println("Playing music...")
        this.music = "Pagsamo"
    }

    override fun play() {
        println("$music song is now playing...")
    }

    override fun stop() {
        println("Music Stopped.")
    }
}

class WesternMusic() : Music() {

    override fun inititialize() {
        println("Playing music...")
        this.music = "Sun and Moon"
    }

    override fun play() {
        println("$music song is now playing...")
    }

    override fun stop() {
        println("Music Stopped.")
    }
}