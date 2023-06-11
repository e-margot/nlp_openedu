require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello 
        a: Привет привет

    state: Weather
        intent!: /weather
        a: Погода
    
    state: Currency
        intent!: /currency
        a: Курс валют

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}