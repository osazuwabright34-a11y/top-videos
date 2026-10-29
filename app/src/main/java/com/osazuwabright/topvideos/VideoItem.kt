package com.osazuwabright.topvideos

import android.net.Uri

data class VideoItem(
    val id: Long,
    val title: String,
    val duration: Long,
    val size: Long,
    val uri: Uri
)