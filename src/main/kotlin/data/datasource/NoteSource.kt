package data.datasource

import domain.entity.Note

interface NoteSource {

    fun saveNote(note: Note)

    fun getNoteById(id: Int): Note
}