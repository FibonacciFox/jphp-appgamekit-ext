# Список методов в категории Benchmarking:
## GetUpdateTime
### Описание
Возвращает количество секунд и долей секунд, потраченных на обновление всего в мире, кроме физики. Это включает в себя анимацию спрайтов, эмуляцию ввода и обработку звуков.
### Определение
```php
float agk::GetUpdateTime()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetUnassignedImages
### Описание
Возвращает количество изображений, загруженных в данный момент в приложение, но не назначенных спрайту или текстовому объекту. Это полезно для отладки, чтобы проверить, что вы удалили все неиспользуемые изображения при переключении из меню на уровень или с одного уровня на другой.
### Определение
```php
UINT agk::GetUnassignedImages()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetUnassignedImageFileName
### Описание
Возвращает имя файла указанного неназначенного изображения.
### Определение
```php
char* agk::GetUnassignedImageFileName( UINT index )
```
### Параметры
```php
index - Индекс неназначенного изображения, между 1 и значением, возвращаемым GetUnassignedImages
```
### Пример кода
---
## GetPixelsDrawn
### Описание
Возвращает оценку количества пикселей, которые были нарисованы на экране в последнем кадре. Как правило, чем ниже это значение, тем лучше производительность. Количество нарисованных пикселей может быть больше, чем количество пикселей на экране, так как перекрывающиеся спрайты могут рисовать один и тот же пиксель дважды.
### Определение
```php
UINT agk::GetPixelsDrawn()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetPhysicsTime
### Описание
Возвращает количество секунд и долей секунд, затраченных на обновление физического моделирования.
### Определение
```php
float agk::GetPhysicsTime()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetParticleDrawnQuadCount
### Описание
Возвращает количество отдельных частиц, которые были нарисованы в последнем кадре с помощью метода quad. Чем выше это число, тем больше работы выполняет двигатель, обрабатывая частицы.
### Определение
```php
UINT agk::GetParticleDrawnQuadCount()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetParticleDrawnPointCount
### Описание
Начиная с версии 108 эта команда всегда будет возвращать 0, так как все частицы рисуются квадратиками. Вместо этого используйте GetParticleDrawnQuadCount.
### Определение
```php
UINT agk::GetParticleDrawnPointCount()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetManagedSpriteSortedCount
### Описание
Возвращает количество спрайтов, которые внутренний менеджер спрайтов должен был отсортировать по их правильным позициям с момента последнего кадра. Спрайты нужно использовать только в том случае, если они меняют глубину или текстуру во время текущего кадра.
### Определение
```php
UINT agk::GetManagedSpriteSortedCount()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetManagedSpriteDrawnCount
### Описание
Возвращает количество спрайтов, которые фактически были отправлены для рендеринга в последний кадр графического процессора, и чем больше их будет нарисовано, тем медленнее будет работать приложение.
### Определение
```php
UINT agk::GetManagedSpriteDrawnCount()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetManagedSpriteCount
### Описание
Возвращает количество спрайтов, управляемых внутренним менеджером спрайтов. Он отвечает за обновление анимации спрайтов и вычисление того, какие спрайты видны и должны быть отправлены для рисования. Он также сортирует спрайты, когда это необходимо для правильного рисования прозрачности.  До тех пор, пока не будет отправлено слишком много спрайтов для рисования, менеджер спрайтов должен быть в состоянии обрабатывать несколько сотен спрайтов.
### Определение
```php
UINT agk::GetManagedSpriteCount()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetManagedSpriteDrawCalls
### Описание
Возвращает количество вызовов OpenGL draw, используемых для рисования всех управляемых спрайтов. Как правило, чем меньше это число, тем лучше производительность. AGK пытается паковать спрайты в как можно меньшее количество вызовов рисования, он делает это, ища спрайты с одинаковой текстурой и рисуя их одновременно.
### Определение
```php
UINT agk::GetManagedSpriteDrawCalls()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetLoadedImages
### Описание
Возвращает количество изображений, загруженных в данный момент в приложение.
### Определение
```php
UINT agk::GetLoadedImages()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetImageMemoryUsage
### Описание
Возвращает объем памяти в мегабайтах, используемый в данный момент всеми загруженными изображениями (включая изображения, используемые шрифтами). Это может помочь отследить проблемы с памятью GPU, которые могут привести к сбою, если она закончится. Каждое загруженное изображение будет помещено в память графического процессора, даже если вы его не используете, поэтому загрузка слишком большого количества больших изображений может израсходовать всю память.
### Определение
```php
float agk::GetImageMemoryUsage()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetDrawingTime
### Описание
Возвращает время, потраченное на замену backbuffer и (при необходимости) ожидание, пока GPU догонит готовый к следующему кадру.
### Определение
```php
float agk::GetDrawingTime()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetDrawingSetupTime
### Описание
Возвращает количество секунд и долей секунд, затраченных на подготовку мира к рисованию. Это включает в себя вычисление того, что видно, преобразование спрайтов в их положение на экране и отправку вершин в графический процессор.
### Определение
```php
float agk::GetDrawingSetupTime()
```
### Параметры
```php
undefined
```
### Пример кода
---