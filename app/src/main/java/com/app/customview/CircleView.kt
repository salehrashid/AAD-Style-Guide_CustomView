package com.app.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx: Context, attr: AttributeSet) : View(ctx, attr) {
    //radius untuk view
    private var radius = 100f

    //untuk memberi warna pada tampilan view
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)

        //OVERRIDE'S
        //onFinishedInflate() -> dipanggil setelah view dan semua turunannya berhasil di inflated dari XML
        //onMeasure() -> dipanggil untuk menentukan ukuran view dan semua turunannya
        //onLayout() -> dipanggil ketika view harus menetapkan ukuran dan posisi untuk semua turunannya
        //onSizeChanged() -> dipanggil ketika ukuran view telah berubah
        //onDraw() -> dipanggil ketika tampilan harus melakukan render kontennya
        //onKeyDown() -> dipanggil ketika ada sebuah event key down baru terjadi
        //onKeyUp() -> dipanggil ketika event key up terjadi
        //onTrackballEvent() -> dipanggil ketika terjadi gerakan pada trackball
        //onTouchEvent() -> dipanggil ketika terjadi sentuhan pada layar
    }
}