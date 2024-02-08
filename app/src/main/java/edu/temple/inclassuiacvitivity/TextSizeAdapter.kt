package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numberList : Array<Int>) : BaseAdapter() {
    private val context = _context
    private val numberList = _numberList
    override fun getCount(): Int {
        return numberList.size

    }

    override fun getItem(position: Int): Any {
        return numberList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = getItem(position).toString()
        textView.textSize = 48f
        textView.setPadding(5, 10, 0, 10)
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return getView(position, convertView, parent).apply{
            (this as TextView).textSize = getItem(position).toString().toFloat()
        }
    }

}