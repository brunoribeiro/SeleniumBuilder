package kz.qwertukg

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

/**
 * Selenium Kotlin Builder
 * Created by Daniil Rakhmatulin
 * http://daniil.rakhmatulin.kz
 */

/*
* Single element functions
* */

/*
* Find element by
* */
fun WebElement.element(by: By, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(by)
    element.init()
    return element
}

/*
* Find element by id
* */
fun WebElement.elementById(id: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.id(id))
    element.init()
    return element
}

/*
* Find element by class
* */
fun WebElement.elementByClass(className: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.className(className))
    element.init()
    return element
}

/*
* Find element by name
* */
fun WebElement.elementByName(name: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.name(name))
    element.init()
    return element
}

/*
* Find element by selector
* */
fun WebElement.elementBySelector(selector: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.cssSelector(selector))
    element.init()
    return element
}

/*
* Find element by xpath
* */
fun WebElement.elementByXpath(xpath: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.xpath(xpath))
    element.init()
    return element
}

/*
* Single element or null functions
* */

/*
* Find element by or null
* */
fun WebElement.elementOrNull(by: By, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(by)

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* Find element by id or null
* */
fun WebElement.elementByIdOrNull(id: String, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(By.id(id))

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* Find element by class or null
* */
fun WebElement.elementByClassOrNull(className: String, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(By.className(className))

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* Find element by name or null
* */
fun WebElement.elementByNameOrNull(name: String, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(By.name(name))

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* Find element by css selector or null
* */
fun WebElement.elementBySelectorOrNull(selector: String, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(By.cssSelector(selector))

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* Find element by xpath or null
* */
fun WebElement.elementByXpathOrNull(xpath: String, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(By.xpath(xpath))

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* elements collection functions
* */

/*
* Find elementS by
* */
fun WebElement.elements(by: By, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements =  findElements(by)
    elements.init()
    return elements
}

/*
* Find elementS by class
* */
fun WebElement.elementsByClass(className: String, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(By.className(className))
    elements.init()
    return elements
}

/*
* Find elementS by name
* */
fun WebElement.elementsByName(name: String, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(By.name(name))
    elements.init()
    return elements
}

/*
* Find elementS by css selector.
* */
fun WebElement.elementsBySelector(selector: String, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(By.cssSelector(selector))
    elements.init()
    return elements
}

/*
* Find elementS by xpath.
* */
fun WebElement.elementsByXpath(xpath: String, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(By.xpath(xpath))
    elements.init()
    return elements
}

/*
* element existing functions.
* */

/*
* Element exists by.
* */
fun WebElement.elementExists(by: By): Boolean {
    val elements = findElements(by)
    return elements.isNotEmpty()
}

/*
* Element exists by id
* */
fun WebElement.elementByIdExists(id: String): Boolean {
    val elements = findElements(By.id(id))
    return elements.isNotEmpty()
}

/*
* Element exists by class name
* */
fun WebElement.elementByClassExists(className: String): Boolean {
    val elements = findElements(By.className(className))
    return elements.isNotEmpty()
}

/*
* Element exists by name
* */
fun WebElement.elementByNameExists(name: String): Boolean {
    val elements = findElements(By.name(name))
    return elements.isNotEmpty()
}

/*
* Element exists by css selector
* */
fun WebElement.elementBySelectorExists(selector: String): Boolean {
    val elements = findElements(By.cssSelector(selector))
    return elements.isNotEmpty()
}

/*
* Element exists by xpath
* */
fun WebElement.elementByXpathExists(xpath: String): Boolean {
    val elements = findElements(By.xpath(xpath))
    return elements.isNotEmpty()
}