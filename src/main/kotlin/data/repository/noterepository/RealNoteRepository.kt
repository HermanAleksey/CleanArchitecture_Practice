package data.repository.noterepository

import data.datasource.NoteSource
import domain.entity.Note

class RealNoteRepository(
    val noteSource: NoteSource
): NoteRepository {
    override fun saveNote(note: Note) {
        noteSource.saveNote(note)
    }

    override fun getNoteById(id: Int): Note {
        return noteSource.getNoteById(id)
    }
}