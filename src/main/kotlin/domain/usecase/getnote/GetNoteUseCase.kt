package domain.usecase.getnote

import domain.entity.Note

interface GetNoteUseCase {
    fun execute(id: Int): Note
}