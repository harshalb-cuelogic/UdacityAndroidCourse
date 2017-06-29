package com.cuelogic.udacityandroidcourse

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View
import java.text.NumberFormat



class MainActivity : AppCompatActivity() {

    var quantity = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quantityTextView = findViewById(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + quantity
        val priceTextView = findViewById(R.id.price_text_view) as TextView
        priceTextView.text = NumberFormat.getCurrencyInstance().format(quantity)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        //display(quantity)
        //displayPrice(quantity * 5)
        var price = quantity * 5;
        var priceMessage = "Total: $${price}\nThank you!"
        displayMessage(priceMessage)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + number
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        val priceTextView = findViewById(R.id.price_text_view) as TextView
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number)
    }

    /**
     * This method increments the quantity on the screen.
     */
    fun increment(view: View)
    {
        display(++quantity)
    }

    /**
     * This method decrements the quantity on the screen.
     */
    fun decrement(view: View)
    {
        display(--quantity)
    }

    /**
     * This method displays the given text on the screen.
     */
    private fun displayMessage(message: String) {
        val priceTextView = findViewById(R.id.price_text_view) as TextView
        priceTextView.text = message
    }
}