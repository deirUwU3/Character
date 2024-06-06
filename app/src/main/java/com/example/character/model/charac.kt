package com.example.character.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Charac(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)