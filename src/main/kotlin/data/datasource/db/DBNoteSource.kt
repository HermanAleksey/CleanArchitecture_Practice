package data.datasource.db

import data.datasource.NoteSource
import domain.entity.Note

class DBNoteSource : NoteSource {

    private val noteList = mutableListOf<Note>()

    override fun saveNote(note: Note) {
        //db saving note
        noteList.add(note)
    }

    override fun getNoteById(id: Int): Note {
        return noteList.first { id == id }
    }
}