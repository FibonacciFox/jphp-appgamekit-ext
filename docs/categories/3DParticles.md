# Список методов в категории 3DParticles:
## Update3DParticles
### Описание
Немедленно опережает излучатель частиц на заданное количество времени. Если вы хотите продвинуть высокочастотный излучатель на большой промежуток времени, такой как 1 секунда, вы должны вызвать эту команду несколько раз с небольшим значением времени, таким как 0,02, чтобы она создавала новые частицы партиями и равномерно распределяла их. Вызов его один раз с большим временным значением 1 секунда создал бы огромную партию частиц сразу и переместил бы их вместе как каплю вместо того, чтобы распространять их.
### Определение
```php
void agk::Update3DParticles( UINT ID, float time )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
time - Время в секундах для продвижения излучателя.
```
### Пример кода
---
## Set3DParticlesVisible
### Описание
Устанавливает, рисуются ли испускаемые частицы. Установите значение 1, чтобы показать частицы, и 0, чтобы скрыть их. Частицы все равно будут обновляться, пока они скрыты, вы можете остановить обновление частиц с помощью Set3DParticlesActive
### Определение
```php
void agk::Set3DParticlesVisible( UINT ID, int visible )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
visible - 1=показать, 0=скрыть
```
### Пример кода
---
## Set3DParticlesVelocityRange
### Описание
Устанавливает минимальный и максимальный множитель, который будет влиять на испускаемые частицы. Это может быть использовано для обеспечения некоторого изменения скорости при испускании частиц.
### Определение
```php
void agk::Set3DParticlesVelocityRange( UINT ID, float v1, float v2 )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
v1 - Минимальный множитель скорости.
v2 - Множитель максимальной скорости.
```
### Пример кода
---
## Set3DParticlesTransparency
### Описание
Установите прозрачность частиц на определенную настройку с выбором без прозрачности, альфа-прозрачности и аддитивного смешивания. По умолчанию частицы создаются с альфа-прозрачностью.
### Определение
```php
void agk::Set3DParticlesTransparency( UINT ID, int mode )
```
### Параметры
```php
ID - Идентификатор излучателя частиц для изменения.
mode - Режим прозрачности для этих частиц: 0=выкл., 1=альфа-прозрачность, 2=аддитивное смешивание
```
### Пример кода
---
## Set3DParticlesStartZone
### Описание
Задает область вокруг излучателя, в которой могут появиться новые частицы. Эти значения относятся к положению эмиттера, например, зона 0,0,0,0 будет означать, что все частицы начинаются в точке положения эмиттера. Зона -10 в x и +10 x, где y и z равны 0 (-10,0,0,10,0,0), создаст линию, центрированную на положении излучателя, вдоль которой будут случайным образом появляться частицы. Зона коробки, где x, y и z не равны нулю, означала бы, что частицы могут начинаться в любой точке внутри коробки.
### Определение
```php
void agk::Set3DParticlesStartZone( UINT ID, float x1, float y1, float z1, float x2, float y2, float z2 )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
x1 - Координата x верхнего левого угла стартовой зоны.
y1 - Координата y верхнего левого угла стартовой зоны.
z1 - z-координата верхнего левого угла стартовой зоны.
x2 - Координата x в правом нижнем углу стартовой зоны.
y2 - Координата y в правом нижнем углу стартовой зоны.
z2 - Координата z в правом нижнем углу стартовой зоны.
```
### Пример кода
---
## Set3DParticlesSize
### Описание
Задает размер всех частиц в мировых координатах. Установка большого количества частиц на большой размер будет плохо работать на мобильных устройствах с низкой скоростью заполнения (количество пикселей, которые он может нарисовать в секунду).
### Определение
```php
void agk::Set3DParticlesSize( UINT ID, float size )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
size - Размер частиц
```
### Пример кода
---
## Set3DParticlesPosition
### Описание
Устанавливает положение 3D-излучателя частиц. Это положение, из которого будут появляться новые частицы, и не влияет на частицы, которые уже видны.
### Определение
```php
void agk::Set3DParticlesPosition( UINT ID, float x, float y, float z )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
x - Новая координата x для излучателя в мировых координатах.
y - Новая координата y для излучателя в мировых координатах.
z - Новая координата z для излучателя в мировых координатах.
```
### Пример кода
---
## Set3DParticlesMax
### Описание
Устанавливает максимальное количество частиц, которые будут испускаться. Если это значение равно -1, то число бесконечно. Излучатель будет вести подсчет общего количества частиц, которые он испускает, и остановится, когда будет достигнут предел. Чтобы проверить, достиг ли излучатель своего предела, используйте Get3DParticlesMaxReached. Чтобы сбросить счетчик и заставить его снова начать излучать, используйте Reset3DParticleCount.
### Определение
```php
void agk::Set3DParticlesMax( UINT ID, int max )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
max - Максимальное количество испускаемых частиц
```
### Пример кода
---
## Set3DParticlesLife
### Описание
Устанавливает время жизни частиц в секундах после их испускания. После того, как частицы будут живы в течение заданного количества секунд, они исчезнут. Это одно из двух значений, влияющих на количество генерируемых частиц, другое-Set3DParticlesFrequency. Максимальное количество частиц, которое может быть на экране в любой момент времени, - это freq*life, причем freq-это количество частиц, испускаемых в секунду. Это значение не зависит от частоты кадров.
### Определение
```php
void agk::Set3DParticlesLife( UINT ID, float time )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
time - Время в секундах, в течение которого частица видна.
```
### Пример кода
---
## Set3DParticlesImage
### Описание
Устанавливает изображение, которое будет использоваться для каждой частицы.
### Определение
```php
void agk::Set3DParticlesImage( UINT ID, UINT imageID )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
imageID - Идентификатор изображения, используемого для испускаемых частиц.
```
### Пример кода
---
## Set3DParticlesFrequency
### Описание
Задает частоту генерации новых частиц. Значение freq указывает, сколько частиц должно быть произведено в секунду, это не зависит от частоты кадров. Это одно из двух значений, влияющих на количество генерируемых частиц, другое-SetParticlesLife. Максимальное количество частиц, которое может быть на экране в любой момент времени, - это freq*life, причем жизнь-это количество секунд, в течение которых частица живет, прежде чем исчезнуть.
### Определение
```php
void agk::Set3DParticlesFrequency( UINT ID, float freq )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
freq - Скорость образования новых частиц в частицах в секунду.
```
### Пример кода
---
## Set3DParticlesDirectionRange
### Описание
Задает диапазон направления в градусах, который частица может выбрать при первом запуске. Это берет базовое направление, заданное с помощью Set3DParticlesDirection, и регулирует его на случайную величину между 0 и углом 1/2 градуса в одном направлении и углом 2/2 градуса в перпендикулярном направлении. Например, угол 1, равный 0, и угол 2, равный 0, означают, что все новые частицы следуют точно в указанном ранее направлении. Угол 1, равный 360, и угол 2, равный 0, означали бы, что частицы могут двигаться в любом направлении по плоскому кругу, в то время как угол 1, равный 360, и угол 2, равный 180, означали бы, что частицы будут двигаться в любом направлении по сфере. Углы образуют пирамиду, выровненную с направлением излучателя частиц, указанным ранее. Угол 1 должен быть между 0 и 360, угол 2 должен быть между 0 и 180.
### Определение
```php
void agk::Set3DParticlesDirectionRange( UINT ID, float angle1, float angle2 )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
angle1 - Диапазон изменения, который частица может выбрать из направления излучателя.
angle2 - Перпендикулярный диапазон изменения, который частица может выбрать из направления излучателя.
```
### Пример кода
---
## Set3DParticlesDirection
### Описание
Задает начальное направление новых частиц, когда они выходят из излучателя. Это можно использовать вместе с командой Set3DParticlesDirectionRange, чтобы установить диапазон отклонения от этого начального направления, которое могут выбрать новые частицы. Это также устанавливает начальную скорость частиц, принимая длину вектора за единицы в секунду. Например, если начальное направление vx=10, vy=-15, vz=0, частицы начнут двигаться в направлении X со скоростью 10 единиц в секунду и в направлении Y со скоростью 15 единиц в секунду и будут продолжать эту скорость движения в течение всей своей жизни, если на них не будут влиять силы, добавленные с помощью Add3DParticlesForce.
### Определение
```php
void agk::Set3DParticlesDirection( UINT ID, float vx, float vy, float vz, float roll )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
vx - Направление x, в котором частицы будут двигаться изначально.
vy - Направление y, в котором частицы будут двигаться изначально.
vz - Направление z, в котором частицы будут двигаться изначально.
roll - Угол поворота излучателя в заданном направлении
```
### Пример кода
---
## Set3DParticlesColorInterpolation
### Описание
Устанавливает режим интерполяции для изменения цвета. Цвета могут быть установлены в определенные моменты жизни частицы с помощью Add3DParticlesColorKeyFrame, и частица либо смешается между этими цветами (плавная интерполяция), либо быстро изменится, когда достигнет следующего изменения цвета (без интерполяции).
### Определение
```php
void agk::Set3DParticlesColorInterpolation( UINT ID, int mode )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
mode - 1=плавная интерполяция, 0=отсутствие интерполяции
```
### Пример кода
---
## Set3DParticlesActive
### Описание
Устанавливает, обновляются ли испускаемые частицы каждый кадр. Установите значение 1, чтобы обновить частицы как обычно, и 0, чтобы приостановить их. Частицы будут продолжать быть видимыми, когда остановятся. Чтобы скрыть частицы, используйте Set3DParticlesVisible.
### Определение
```php
void agk::Set3DParticlesActive( UINT ID, int active )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
active - 1=нормально, 0=пауза
```
### Пример кода
---
## Reset3DParticleCount
### Описание
Сбрасывает количество испускаемых частиц, когда излучатель был установлен с максимальным количеством частиц с помощью Set3DParticlesMax. Вы можете проверить, когда излучатель достиг своего максимального количества, используя Get3DParticlesMaxReached. Если максимум установлен на -1, то эта команда не имеет никакого эффекта.
### Определение
```php
void agk::Reset3DParticleCount( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
```
### Пример кода
---
## Offset3DParticles
### Описание
Немедленно перемещает все существующие частицы на заданное смещение. Например, смещение x=3,y=5,z=0 сдвинет все частицы вправо на 3 единицы и вниз на 5 единиц. Это не влияет на излучатель частиц, но может быть использовано в сочетании с Set3DParticlesPosition для перемещения как излучателя, так и уже существующих частиц.
### Определение
```php
void agk::Offset3DParticles( UINT ID, float x, float y, float z )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
x - Расстояние для перемещения частиц в направлении X.
y - Расстояние для перемещения частиц в направлении Y.
z - Расстояние для перемещения частиц в направлении Z.
```
### Пример кода
---
## Get3DParticlesZ
### Описание
Возвращает текущее Z - положение излучателя, это точка, из которой будут появляться новые частицы. Невозможно получить положение отдельных частиц, они просто создаются, следуют по пути под влиянием сил, а затем исчезают.
### Определение
```php
float agk::Get3DParticlesZ( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesX
### Описание
Возвращает текущее положение X излучателя, это точка, из которой будут появляться новые частицы. Невозможно получить положение отдельных частиц, они просто создаются, следуют по пути под влиянием сил, а затем исчезают.
### Определение
```php
float agk::Get3DParticlesX( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesY
### Описание
Возвращает текущее положение Y излучателя, это точка, из которой будут появляться новые частицы. Невозможно получить положение отдельных частиц, они просто создаются, следуют по пути под влиянием сил, а затем исчезают.
### Определение
```php
float agk::Get3DParticlesY( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesVisible
### Описание
Возвращает 0, если данные частицы были установлены как невидимые с помощью Set3DParticlesVisible, или 1, если они в данный момент установлены как видимые (по умолчанию). Это не проверяет, находятся ли частицы в видимом окне просмотра.
### Определение
```php
int agk::Get3DParticlesVisible( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesSize
### Описание
Возвращает текущий размер всех частиц в мировых координатах. Дополнительные сведения об установке размера частиц см. в разделе Set3DParticlesSize.
### Определение
```php
float agk::Get3DParticlesSize( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesMaxReached
### Описание
Возвращает 1, если излучатель испустил количество частиц, указанное в Set3DParticlesMax, и все испущенные частицы с тех пор умерли, в противном случае возвращает 0. Если максимальное значение равно -1, то оно всегда будет возвращать 0. Чтобы сбросить счетчик и заставить излучатель снова начать излучать, используйте Reset3DParticleCount.
### Определение
```php
int agk::Get3DParticlesMaxReached( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesLife
### Описание
Возвращает текущую жизнь частиц в секундах. Невозможно получить текущую жизнь отдельных частиц. Это значение не зависит от частоты кадров.
### Определение
```php
float agk::Get3DParticlesLife( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesExists
### Описание
Возвращает 1, если 3D-излучатель частиц существует с заданным идентификатором, и 0, если нет.
### Определение
```php
int agk::Get3DParticlesExists( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesDirectionZ
### Описание
Возвращает z-компоненту направления излучателя, которое является базовым направлением движения частиц при их создании. Частицы могут слегка изменять свое направление при излучении в зависимости от текущего значения Set3DParticlesDirection.
### Определение
```php
float agk::Get3DParticlesDirectionZ( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesDirectionY
### Описание
Возвращает y-компоненту направления излучателя, которое является базовым направлением движения частиц при их создании. Частицы могут слегка изменять свое направление при излучении в зависимости от текущего значения Set3DParticlesDirection.
### Определение
```php
float agk::Get3DParticlesDirectionY( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesDirectionX
### Описание
Возвращает X-компоненту направления излучателя, которое является базовым направлением движения частиц при их создании. Частицы могут слегка изменять свое направление при излучении в зависимости от текущего значения Set3DParticlesDirection.
### Определение
```php
float agk::Get3DParticlesDirectionX( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesDirectionRange2
### Описание
Возвращает угол второго излучателя в градусах. Это значение представляет собой величину отклонения частицы от направления излучателя при излучении. Угол 0 означает, что отклонение отсутствует, а угол 360 означает, что частица может двигаться в любом направлении в этой плоскости при излучении.
### Определение
```php
float agk::Get3DParticlesDirectionRange2( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesActive
### Описание
Возвращает 0, если данные частицы были приостановлены с помощью Set3DParticlesActive, или 1, если они в данный момент обновляются как обычно (по умолчанию).
### Определение
```php
int agk::Get3DParticlesActive( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesDirectionRange1
### Описание
Возвращает первый угол излучателя в градусах. Это значение представляет собой величину отклонения частицы от направления излучателя при излучении. Угол 0 означает, что отклонение отсутствует, а угол 360 означает, что частица может двигаться в любом направлении в этой плоскости при излучении.
### Определение
```php
float agk::Get3DParticlesDirectionRange1( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Get3DParticlesFrequency
### Описание
Возвращает текущую частоту генерации частиц в частицах в секунду. Это значение не зависит от частоты кадров.
### Определение
```php
float agk::Get3DParticlesFrequency( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для проверки.
```
### Пример кода
---
## Draw3DParticles
### Описание
Немедленно притягивает частицы к backbuffer в его текущем положении, размере и вращении. Это полезно, если вы хотите настроить сцену для захвата getImage. Не забудьте использовать ClearScreen для очистки любого вашего собственного рисунка перед вызовом Sync или Render для фактического кадра, иначе ваш рисунок может появиться дважды в окончательном рендеринге.
### Определение
```php
void agk::Draw3DParticles( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для рисования.
```
### Пример кода
---
## Delete3DParticles
### Описание
Удаляет 3D-излучатель частиц и все его частицы. Если какие-либо частицы были в данный момент видны, они мгновенно исчезнут.
### Определение
```php
void agk::Delete3DParticles( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для удаления.
```
### Пример кода
---
## Create3DParticles
### Описание
Создает излучатель частиц с заданным идентификатором и заданным местоположением в мировых координатах. Излучатели частиц создают поток маленьких спрайтов, которые длятся фиксированное количество времени, прежде чем исчезнуть. Частицы могут подвергаться воздействию сил в течение своей жизни с помощью Add3DParticlesForce. Они также могут менять цвет с течением времени с помощью Add3DParticleColorKeyFrame. Частицы не могут быть изменены по отдельности и вести себя как группа, используя одну и ту же текстуру. Это позволяет AGK рисовать их более эффективно, чем аналогичное количество обычных объектов.
### Определение
```php
UINT agk::Create3DParticles( float x, float y, float z )
void agk::Create3DParticles( UINT ID, float x, float y, float z )
```
### Параметры
```php
x - Координата x для позиционирования этого излучателя.
y - Координата y для позиционирования этого излучателя.
z - Координата z для позиционирования этого излучателя.
ID - Идентификатор, используемый при ссылке на этот 3D-излучатель частиц.
```
### Пример кода
---
## Clear3DParticlesForces
### Описание
Очищает все силы, назначенные этому излучателю. Все силы немедленно перестанут влиять на частицы.
### Определение
```php
void agk::Clear3DParticlesForces( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
```
### Пример кода
---
## Clear3DParticlesScales
### Описание
Очищает все модификаторы размера, которые были назначены эмиттеру, частицы будут поддерживать любой размер, который они в настоящее время имеют.
### Определение
```php
void agk::Clear3DParticlesScales( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
```
### Пример кода
---
## Clear3DParticlesColors
### Описание
Очищает все цвета, которые были назначены излучателю, частицы будут поддерживать любой цвет, который они имеют в данный момент.
### Определение
```php
void agk::Clear3DParticlesColors( UINT ID )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
```
### Пример кода
---
## Add3DParticlesForce
### Описание
Добавляет силу, которая будет действовать в данный момент в жизни каждой частицы. Например, сила, установленная для начала в момент времени 2 и окончания в момент времени 3, начнет воздействовать на частицы, когда они будут живы в течение 2 секунд. Он будет продолжать действовать на эти частицы до тех пор, пока они не оживут в течение 3 секунд. Влияние силы определяется величинами x, y и z, которые представляют ускорение в единицах в секунду. Например, сила с x=5 будет регулировать горизонтальную скорость частицы, добавляя 5 единиц за каждую секунду, когда сила активна, если сила активна только в течение 0,5 секунды, то частица будет двигаться на 2,5 единицы в секунду быстрее в направлении X. Несколько сил могут действовать на частицу одновременно, если их временные интервалы перекрываются.
### Определение
```php
void agk::Add3DParticlesForce( UINT ID, float starttime, float endtime, float x, float y, float z )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
starttime - Время в жизни частицы, в которое эта сила должна начать действовать.
endtime - Время в жизни частицы, в которое эта сила должна прекратить свое действие.
x - х-составляющая влияния силы на скорость частицы в единицах в секунду.
y - y-составляющая влияния силы на скорость частицы в единицах в секунду.
z - z-составляющая влияния силы на скорость частицы в единицах в секунду.
```
### Пример кода
---
## Add3DParticlesColorKeyFrame
### Описание
Добавляет изменение цвета в определенный момент жизни частицы. Например, цвет, добавленный со временем=1, сделает частицу равной данному цвету, когда она была жива в течение 1 секунды. Если цветовая интерполяция включена с помощью Set3DParticlesColorInterpolation, частица постепенно преобразуется из своего текущего цвета в следующий. Например, если вы добавите три цвета: красный, когда время=1, зеленый, когда время=2, и синий, когда время=3, то частица начнет свою жизнь как красный (поскольку это ближайший цвет) и останется полностью красной, пока ей не исполнится 1 секунда. Когда частице от 1 до 2 секунд, она будет постепенно меняться с красного на зеленый, пока ей не исполнится 2 секунды, в этот момент она полностью зеленая. Когда частице от 2 до 3 секунд, она будет постепенно меняться от зеленого до синего, пока ей не исполнится 3 секунды, в этот момент она полностью синяя. Частица останется полностью синей до конца своей жизни, так как никакие другие цвета не были добавлены.
### Определение
```php
void agk::Add3DParticlesColorKeyFrame( UINT ID, float time, UINT red, UINT green, UINT blue, UINT alpha )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
time - Время, когда частицы должны стать такого цвета.
red - Красная составляющая нового цвета.
green - Зеленая составляющая нового цвета.
blue - Синий компонент нового цвета.
alpha - Альфа-компонент нового цвета.
```
### Пример кода
---
## Add3DParticlesScaleKeyFrame
### Описание
Добавляет изменение размера в определенный момент жизни частицы. Значения шкалы относятся к значению, заданному Set3DParticlesSize, поэтому шкала 2 означает удвоение ее нормального размера, а 0,5-половину ее нормального размера. Масштаб, добавленный со временем=1, заставит частицу постепенно трансформироваться в заданную, пока она не будет жива в течение 1 секунды, когда она будет соответствовать заданному размеру. Затем частица постепенно преобразуется из этого размера в следующий (если следующий размер существует).
### Определение
```php
void agk::Add3DParticlesScaleKeyFrame( UINT ID, float time, float scale )
```
### Параметры
```php
ID - Идентификатор излучателя для изменения.
time - Время, за которое частицы должны стать такого размера.
scale - Масштаб относительно нормального размера частиц должен быть больше или равен 0.
```
### Пример кода
---