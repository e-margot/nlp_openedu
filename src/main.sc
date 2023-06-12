require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
    # a: Начнём kdkd.
    state: /hello
        # intent!: /hello
        q!: *(*привет*/*старт*/*здравст*)*
        a: привет!

    state: /weather
        # intent!: /weather
        q!: *(*погод*/*прогноз*/*дождь*/*ветер*)*
        a: weather weather

    state: /currency
        # intent!: /currency
        q!: *(*курс*/*валют*/*стои*)*
        a: currency currency

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}