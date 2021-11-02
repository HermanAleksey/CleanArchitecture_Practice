package data.repository.noterepository

import domain.entity.Note

interface NoteRepository {

    fun saveNote(note: Note)

    fun getNoteById(id: Int): Note
}