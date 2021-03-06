package kz.qwertukg

import org.junit.Assert.assertEquals
import org.junit.Test

class WebDriverKtTest {
    @Test
    fun `test chromeDriver, elementById, wait, elementVisibilityById, elementVisibilityBySelector functions on google`() {
        var result = ""

        chromeDriver(settings) {
            get("http://google.com")

            elementById("lst-ib") {
                sendKeys("kotlin")

                wait(10) {
                    elementVisibilityByName("btnK") {
                        click()
                    }

                    elementVisibilityBySelector("a[href = 'https://kotlinlang.org/']") {
                        result = text
                    }
                }
            }
        }

        assertEquals("Kotlin Programming Language", result)
    }
}