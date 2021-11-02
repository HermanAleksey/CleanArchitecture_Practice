package domain.usecase.savenote

import domain.entity.Note

interface SaveNoteUseCase {
    fun execute(note: Note)
}