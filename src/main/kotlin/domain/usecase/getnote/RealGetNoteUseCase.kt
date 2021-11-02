package domain.usecase.getnote

import data.repository.noterepository.NoteRepository
import domain.entity.Note

class RealGetNoteUseCase(
    private val noteRepository: NoteRepository
) : GetNoteUseCase {
    override fun execute(id: Int): Note {
        return noteRepository.getNoteById(id)
    }
}