import java.util.Scanner

fun main() {

    //  Пункт 1
    val scanner = Scanner(System.`in`)

    println("Введите свой возраст в днях")
    val ageInDays = scanner.nextInt()

    if (ageInDays < 0) {
        println("Введено некорректное значение")
        return
    }

    val years = ageInDays / 365
    val month = (ageInDays % 365) / 30
    val days = (ageInDays % 365) % 30
    val ageArray = arrayOf(years, month, days)

    println("Ваш возраст: ${ageArray[0]} годика, ${ageArray[1]} месяцев, ${ageArray[2]} дней")

    // Пункт 2

    val daysOfWeek = enumValues<DayOfWeek>()

    println("Введите день недели (1-7):")
    val dayNumber = readLine()?.toInt() ?: return

    if (dayNumber < 1 || dayNumber > 7) {
        println("Некорректный номер дня недели")
        return
    }

    val dayOfWeek = daysOfWeek.getOrNull(dayNumber - 1)

    if (dayOfWeek == null) {
        println("Некорректный номер дня недели")
        return
    }

    val schedule = when (dayOfWeek) {
        DayOfWeek.MONDAY -> """
            Понедельник:
            08:00 Работа
            17:00 Тренировка
        """.trimIndent()

        DayOfWeek.TUESDAY -> """
             Вторник:
            09:00 Встреча
            13:00 Обед
        """.trimIndent()

        DayOfWeek.WEDNESDAY -> """
            Среда:
            10:00 Уроки
            16:00 Работа над проектом
        """.trimIndent()

        DayOfWeek.THURSDAY -> """
             Четверг:
            12:00 Обеденный перерыв
            18:00 Тимбилдинг
        """.trimIndent()

        DayOfWeek.FRIDAY -> """
              Пятница:
            08:00 Работа
            17:00 Тренировка
        """.trimIndent()

        DayOfWeek.SATURDAY -> """
              Суббота:
            10:00 Завтрак
            14:00 Прогулк
        """.trimIndent()

        DayOfWeek.SUNDAY -> """
              Воскресенье:
            11:00 Отдых
            19:00 Подготовка к следующей неделе
        """.trimIndent()
    }

    println(schedule)
}