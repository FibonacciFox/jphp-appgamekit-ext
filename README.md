<h1 align="center">JPHP App Game Kit Library</h1>
<h2 align="center">

<img src="https://img.shields.io/badge/made%20by-FibonacciFox-blue.svg" >

<!--lint disable no-literal-urls-->
<p align="center">
  <a href="https://github.com/FibonacciFox/jphp-appgamekit-ext">
    <img
      alt="App Game Kit for JPHP"
      src="https://dl.dropboxusercontent.com/s/9tyzk5e4iaa9ay7/Game%20Engine.svg?dl=0"
      width="800"
    />
  </a>
</p>
 
</h2>

<p align="center">
<b>App Game Kit</b> - это простой в освоении движок разработки игр.<br> 
Идеально подходит для начинающих, любителей и независимых разработчиков.<br>
Для получения дополнительной информации об использовании AppGameKit см. <a href="https://www.appgamekit.com/">App Game Kit</a>.<br>
<b>jphp-appgamekit-ext</b> - пакет App Game Kit для JPHP (Java) уже здесь.
</p>

# Навигация

- [О пакете](#jphp-appgamekit-ext)
  - [Быстрый старт](#быстрый-старт)
    - [Установка](#установка)
    - [Hello World](#hello-world)
- [Методы по категориям](#методы)

## jphp-appgamekit-ext

- **Описание**: Пакет для разработки 2D-3D игр и программ на движке App Game Kit, используя возможности JPHP и Java.
- **Собран**: Менеджером пакетов [JPPM v0.6.7](https://github.com/jphp-group/jphp/releases).
- **Версия**: [v0.9.1](https://github.com/FibonacciFox/jphp-appgamekit-ext).

### Быстрый старт

Краткое руководство:

#### Установка

- **Из консоли**: Если используем Менеджер пакетов [JPPM v0.6.7](https://github.com/jphp-group/jphp/releases):

```console
> jppm add jphp-appgamekit-ext@0.9.1
```

- **DevelNext**: Проект->Пакеты->Добавить пакет из файла [jphp-appgamekit-ext-x.x.dnbundle](https://github.com/FibonacciFox/jphp-appgamekit-ext/releases)->
  Подключить к проекту.

#### Hello World

- **JPPM**:

```php
<?php

use fibonaccifox\AppGameKit;


class App
{

    public $AppGameKit;

    public function __construct()
    {
        $this->AppGameKit = new AppGameKit($this);
        $this->AppGameKit->Init(1024, 768, false);
    }

    public function Begin()
    {

        var_dump("Begin!");
        $this->AppGameKit->SetWindowTitle('Hello World');
        $this->AppGameKit->setvirtualresolution(1024, 768);
        $this->AppGameKit->SetClearColor(227, 225, 225);
        $this->AppGameKit->SetPrintColor(0, 0, 0, 190);
        $this->AppGameKit->UseNewDefaultFonts(1);
        $this->AppGameKit->SetPrintSize(40);
    }

    public function Loop()
    {

        $this->AppGameKit->Print("HelloWorld!");
        $this->AppGameKit->Print("FPS: " . $this->AppGameKit->ScreenFPS());
        $this->AppGameKit->Sync();
    }

    public function End()
    {
      var_dump("End!");
      exit;
    }
}

$App = new App();

```

---

- **DevelNext**:
  Запуск App Game Kit без графического интерфейса в DevelNext:
  В проекте DevelNext убираем все формы, приложение запустится без графической оболочки. Первым будет запущен модуль Загрузчик (AppModule)
  <img src="https://tssaltan.top/files/2017/01/appmodule.png" >
  Добавляем событие Подключение в <b>Загрузчик</b> код:
  <img src="https://dl.dropboxusercontent.com/s/fgnbacg8jjdo7zb/add%20m.png?dl=0" >

  ```php
  $AgkApp = new AgkApp(1024, 768, false);
  ```

  Добавить класс в <b>Загрузчик(AppModule)</b>

  ```php
  use fibonaccifox\AppGameKit;

  class AgkApp
  {

    public $AppGameKit;

    public function __construct()
    {
        $this->AppGameKit = new AppGameKit($this);
        $this->AppGameKit->Init(1024, 768, false);
    }

    public function Begin()
    {

        var_dump("Begin!");
        $this->AppGameKit->SetWindowTitle('Hello World');
        $this->AppGameKit->setvirtualresolution(1024, 768);
        $this->AppGameKit->SetClearColor(227, 225, 225);

        $this->AppGameKit->SetPrintColor(0, 0, 0, 190);
        $this->AppGameKit->UseNewDefaultFonts(1);
        $this->AppGameKit->SetPrintSize(40);
    }

    public function Loop()
    {

        $this->AppGameKit->Print("HelloWorld!");
        $this->AppGameKit->Print("FPS: " . $this->AppGameKit->ScreenFPS());
        $this->AppGameKit->Sync();
    }

    public function End()
    {
        var_dump("End!");
        app()->shutdown();
    }
  ```

}

```


## Методы

Этот раздел содержит список всех команд в Jphp App Game Kit

- [2DPhysics](docs/categories/2DPhysics.md)
- [3D](docs/categories/3D.md)
- [3DParticles](docs/categories/3DParticles.md)
- [3DPhysics](docs/categories/3DPhysics.md)
- [Advert](docs/categories/Advert.md)
- [Benchmarking](docs/categories/Benchmarking.md)
- [Core](docs/categories/Core.md)
- [Error](docs/categories/Error.md)
- [Extras](docs/categories/Extras.md)
- [File](docs/categories/File.md)
- [Font](docs/categories/Font.md)
- [HTTP](docs/categories/HTTP.md)
- [Image](docs/categories/Image.md)
- [Input-Raw](docs/categories/Input-Raw.md)
- [Input](docs/categories/Input.md)
- [Maths](docs/categories/Maths.md)
- [Memblock](docs/categories/Memblock.md)
- [Multiplayer](docs/categories/Multiplayer.md)
- [Music](docs/categories/Music.md)
- [Particles](docs/categories/Particles.md)
- [Skeleton](docs/categories/Skeleton.md)
- [Sound](docs/categories/Sound.md)
- [Sprite](docs/categories/Sprite.md)
- [Text](docs/categories/Text.md)
- [Time](docs/categories/Time.md)
- [Tweening](docs/categories/Tweening.md)
- [Video](docs/categories/Video.md)

---
```
