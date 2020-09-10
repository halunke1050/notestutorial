package com.gehweg.architectureexample

import androidx.lifecycle.LiveData

class NoteRepository(
    val noteDao: NoteDao,
    val allNotes: LiveData<List<Note>>
) {
    val database: NoteDatabase = NoteDatabase
}