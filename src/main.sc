require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        q!: *(привет/здравствуйте/Добрый день/Доброе утро/Доброй ночи)*
        random:
            a: Привет привет
            a: приветики

    state: /weather
        q!: *(погода/погода на сегодня/прогноз погоды)*
        random:
            a: Погода
            a: не погода
    
    state: /currency
        q!: *(курс валют/курс/курс валют на сегодня)*
        random:
            a: Курс валют
            a: все плохо

    state: /NoMatch
        event!: noMatch
        a: Я не понял Вас. Вы сказали: {{$request.query}}

    # state: Match
    #     event!: match
    #     a: {{$context.intent.answer}}