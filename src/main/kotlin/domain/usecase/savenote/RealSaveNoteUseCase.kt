package domain.usecase.savenote

import data.repository.noterepository.NoteRepository
import domain.entity.Note

class RealSaveNoteUseCase(
    private val noteRepository: NoteRepository
) : SaveNoteUseCase {

    override fun execute(note: Note) {
        noteRepository.saveNote(note)
    }
}