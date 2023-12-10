package com.example.newsletterapp.presentation

import android.app.Application

class Application : Application() {
    val appComponent =
        DaggerApplicationComponent.builder()
            .presentationModule(PresentationModule(this))
            .build()
}
