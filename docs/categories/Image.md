# Список методов в категории Image:
## ShowImageCaptureScreen
### Описание
Эта функция устарела, вместо нее используйте SetDeviceCameraToImage. Предоставляет пользователю возможность сделать снимок с помощью камеры устройства, если таковая имеется. Если устройство не имеет камеры или иным образом не может быть использовано, это вернет 0, и ваше приложение будет продолжать работать в обычном режиме. Это не сразу захватывает изображение, в зависимости от платформы ваше приложение может продолжать работать в фоновом режиме, пока пользователь делает снимок, или оно может приостановить выполнение во время съемки. В любом случае вы должны предположить, что ваше приложение продолжает работать, но больше не видно, используйте IsCapturingImage, чтобы проверить, когда пользователь возвращается из процесса захвата изображения, и GetCapturedImage, чтобы обнаружить результат этого процесса. В настоящее время это не работает на Mac.
### Определение
```php
UINT agk::ShowImageCaptureScreen()
```
### Параметры
```php
undefined
```
### Пример кода
---
## ShowChooseImageScreen
### Описание
Предоставляет пользователю возможность выбрать изображение, хранящееся на его текущей платформе, например фотографию на телефоне или изображение, сохраненное на ПК. Это не сразу захватывает изображение, в зависимости от платформы ваше приложение может продолжать работать в фоновом режиме, пока пользователь выбирает изображение, или оно может приостановить выполнение, пока выбирается изображение. В любом случае вы должны предположить, что ваше приложение продолжает работать, но больше не видно, использовать IsChoosingImage, чтобы проверить, когда пользователь возвращается из процесса выбора изображения, и GetChosenImage, чтобы обнаружить результат этого процесса. Эта функция возвращает 1, если ей удалось отобразить экран выбора, и 0 в противном случае.
### Определение
```php
UINT agk::ShowChooseImageScreen()
```
### Параметры
```php
undefined
```
### Пример кода
---
## SetImageWrapU
### Описание
Устанавливает режим УФ-обертывания изображения, когда U-координата выходит за пределы диапазона 0-1. По умолчанию используется режим 0, который фиксирует значение пикселя до последнего допустимого пикселя, режим 1 повторяет текстуру, начиная с противоположной стороны. Чтобы успешно использовать значения UV за пределами 0-1 на всех платформах, рассматриваемое изображение должно иметь степень 2 по ширине и высоте и не быть частью текстуры атласа. Это относится как к зажиму, так и к повторению.
### Определение
```php
void agk::SetImageWrapU( UINT iImageIndex, UINT mode )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для изменения.
```
### Пример кода
---
## SetImageWrapV
### Описание
Устанавливает режим УФ-обертывания изображения, когда координата V выходит за пределы диапазона 0-1. По умолчанию используется режим 0, который фиксирует значение пикселя до последнего допустимого пикселя, режим 1 повторяет текстуру, начиная с противоположной стороны. Чтобы успешно использовать УФ-значения за пределами 0-1 на всех платформах, рассматриваемое изображение должно иметь степень 2 по ширине и высоте и не быть частью текстуры атласа. Это относится как к зажиму, так и к повторению.
### Определение
```php
void agk::SetImageWrapV( UINT iImageIndex, UINT mode )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для изменения.
```
### Пример кода
---
## SetImageTransparentColor
### Описание
Делает определенный цвет полностью прозрачным в выбранном изображении. Это медленная команда, и ее не следует вызывать каждый кадр.
### Определение
```php
void agk::SetImageTransparentColor( UINT iImage, int r, int g, int b )
```
### Параметры
```php
iImage - Идентификатор изображения для изменения.
```
### Пример кода
---
## SetImageSubImages
### Описание
Задает данные подизображения для изображения атласа, которое представляет собой расположение каждого подизображения внутри изображения атласа. Обычно это загружается автоматически из subimages.txt файл при загрузке изображения, но если это невозможно, то эта команда может быть использована для установки этих данных. Файл должен быть действительным subimages.txt файл в том же формате что и указанный в LoadSubImage В отличие от обычной команды load image файл не нуждается в имени subimages.txt, он может иметь любое имя и путь
### Определение
```php
void agk::SetImageSubImages( uint32_t iImageIndex, const char* sSubImageFile )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для изменения
```
### Пример кода
---
## SetImageMinFilter
### Описание
Устанавливает фильтр для текстур, когда текстура меньше пространства экрана, в котором она отображается. Вы можете использовать режим 0, чтобы использовать ближайший пиксель, который будет выглядеть блочным, или 1, чтобы использовать линейный фильтр, который будет выглядеть размытым. Когда изображение точно совпадает с пространством экрана, то оба фильтра будут выглядеть одинаково, когда есть небольшая разница, ближайший имеет тенденцию быть более резким, но может мерцать, когда он меняет выбор пикселей.
### Определение
```php
void agk::SetImageMinFilter( UINT iImageIndex, UINT mode )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для изменения.
```
### Пример кода
---
## SetImageMagFilter
### Описание
Устанавливает фильтр для текстур, когда текстура больше, чем пространство экрана, в котором она отображается. Вы можете использовать режим 0, чтобы использовать ближайший пиксель, который будет выглядеть блочным, или 1, чтобы использовать линейный фильтр, который будет выглядеть размытым. Когда изображение точно совпадает с пространством экрана, то оба фильтра будут выглядеть одинаково, когда есть небольшая разница, ближайший имеет тенденцию быть более резким, но может мерцать, когда он меняет выбор пикселей.
### Определение
```php
void agk::SetImageMagFilter( UINT iImageIndex, UINT mode )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для изменения.
```
### Пример кода
---
## SetImageMask
### Описание
Копирует цветовой канал с одного изображения на другое. Вы можете указать исходный и конечный каналы, используя значения 1,2,3,4 для представления красного, зеленого, синего и альфа-каналов соответственно. Это медленная команда, и ее не следует вызывать каждый кадр. Значения смещения x,y позволяют смещать исходное изображение на целевом изображении, поэтому небольшое исходное изображение можно использовать для маскировки любой части большого изображения. Любая часть большого изображения за пределами размера маленького изображения останется неизменной. отрицательные значения смещения поддерживаются для смещения исходного изображения от верхнего левого края целевого изображения. Если вы добавляете несколько прозрачных пикселей к изображению, которое в настоящее время не имеет ни одного, и используете изображение на спрайте, то обязательно используйте SetSpriteTransparency, чтобы сделать спрайт прозрачным.
### Определение
```php
void agk::SetImageMask( UINT iDstImage, UINT iSrcImage, int dst, int src, int x, int y )
```
### Параметры
```php
iDstImage - Идентификатор изображения для изменения.
```
### Пример кода
---
## SetDeviceCameraToImage
### Описание
Использование идентификатора изображения, большего нуля, приведет к потоковой передаче камеры устройства на выбранное изображение. Изображение в данный момент не должно существовать, оно будет создано этой командой. Используйте ImageID 0, чтобы остановить потоковую передачу, это также приведет к удалению изображения. Параметр cameraID используется, когда устройство имеет несколько камер, например фронтальную и заднюю. Обычно 0 относится к камере, обращенной назад. Используйте GetNumDeviceCameras, чтобы узнать, сколько камер имеет это устройство, и GetDeviceCameraType, чтобы проверить, обращено ли оно спереди или сзади. Этот параметр игнорируется, если ImageID равен 0. У вас может быть активна только одна камера устройства одновременно, поэтому для переключения с задней камеры на фронтальную вы должны сначала вызвать эту команду с ImageID, установленным в 0, чтобы остановить захват, а затем запустить его снова с новым cameraID. Возвращает 1, если она была успешной, 0, если возникла проблема или текущая платформа не поддерживает эту команду. В настоящее время это поддерживается на iOS, Android 4.0.3 и выше, а также Windows.
### Определение
```php
int agk::SetDeviceCameraToImage( UINT cameraID, UINT imageID )
```
### Параметры
```php
cameraID - Идентификатор камеры устройства, которую вы хотите использовать, может быть задней или фронтальной камерой
```
### Пример кода
---
## SaveImage
### Описание
Сохраняет изображение с заданным идентификатором в указанное имя файла. Файл будет помещен в папку записи приложения в том месте, которое в данный момент указано SetFolder. Кроме того, вы можете указать путь, начинающийся с прямой косой черты, чтобы выбрать местоположение из корня папки записи, игнорируя любую папку SetFolder. Рекомендуется использовать расширение .png в конце имени файла для сохранения в формате PNG. Некоторые платформы могут поддерживать дополнительные расширения, такие как .jpg, но это не гарантирует работу на всех платформах.
### Определение
```php
void agk::SaveImage( UINT iImageIndex, const char* filename )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для изменения.
```
### Пример кода
---
## ResizeImage
### Описание
Изменяет размер изображения на новую ширину и высоту. Если изображение является изображением атласа, то его subimages.txt значения также будут изменены таким образом, чтобы LoadSubImage все еще работал. Обратите внимание, что если вы ранее использовали LoadSubImage на этом изображении, то изменение его размера приведет к неправильному отображению этих субизображений. Эта команда не будет работать с самими субизображениями.
### Определение
```php
void agk::ResizeImage( UINT imageID, int width, int height )
```
### Параметры
```php
imageID - Идентификатор изображения для изменения размера
```
### Пример кода
---
## PrintImage
### Описание
Печать изображения на подключенном принтере. Эта команда не гарантированно работает на всех платформах. Параметр size определяет размер изображения на странице, значение 100 позволяет использовать как можно большую часть страницы, 50-половину этой суммы, 25-четверть и так далее.
### Определение
```php
void agk::PrintImage( UINT image, float size )
```
### Параметры
```php
image - идентификатор изображения для печати
```
### Пример кода
---
## LoadSubImage
### Описание
Загружает субизображение из текстуры атласа для использования в качестве автономного изображения в указанный идентификатор изображения. В subimages.txt файл должен начинаться с того же имени, что и файл изображения, например, атласное изображение myImage.png будет иметь файл подизображений с именем myImage subimages.txt. Файл подизображений содержит ряд строк, каждая из которых описывает изображение, существующее в изображении атласа. Каждая строка должна иметь имя формата:X:Y:Width:Height с разделителем :, используемым между полями. Поле Name - это имя, которое вы хотите использовать для ссылки на субизображение при загрузке, оно должно соответствовать параметру sImageFilename этой команды LoadSubImage. Поля X:Y-это координаты пикселей X и Y, представляющие верхний левый угол подизображения, а поля Width:Height-это размер в пикселях подизображения. Эти значения затем используются для извлечения вашего именованного изображения из атласа и загрузки его в свой собственный идентификатор изображения, который будет использоваться как обычное изображение. Изображение атласа должно оставаться загруженным в течение всего времени использования загруженного субизображения. Обратите внимание, что при загрузке подизображения AGK немного изменит UV-координаты, чтобы изображение не крало пиксели из соседних изображений во время фильтрации, по умолчанию он сдвигает UV внутрь на 0,5 пикселя. Вы можете переопределить это, установив SetSpriteUVBorder равным 0 для спрайтов, где вам нужны идеальные пиксельные результаты, но вам придется следить за тем, чтобы пиксель кровоточил по краям, и, возможно, вам придется дать вашим субизображениям границу в 1 пиксель соответствующего цвета, которую он может безопасно украсть при фильтрации.
### Определение
```php
UINT agk::LoadSubImage ( UINT iParentIndex, const char *sImageFilename )
void agk::LoadSubImage ( UINT iImageIndex, UINT iParentIndex, const char *sImageFilename )
```
### Параметры
```php
iParentIndex - Идентификатор изображения, содержащего текстуру атласа, загруженную ранее.
sImageFilename - Имя файла вложенного образа, хранящегося в subimages.txt. Не используйте путь перед именем файла.
```
### Пример кода
---
## LoadImageResized
### Описание
Загружает изображение, изменяя его размер в процессе. Это позволяет вам иметь одно высококачественное изображение, а затем изменять его размер в зависимости от разрешения устройства во время выполнения, вместо того чтобы иметь несколько уровней качества. Уменьшение размера изображения предпочтительнее увеличения размера изображения, так как увеличение размера изображения не улучшает качество, но оба варианта поддерживаются. Значение 1.0 не изменяет размер изображения, значение меньше 1 сделает изображение меньше, значение больше 1 сделает изображение больше. Значения масштабирования должны быть больше 0, но могут быть любой дробью, то есть допустима шкала 0,6742. Масштаб 0,5 уменьшит размер изображения вдвое, 2,0-вдвое, и так далее. Изображение может быть изменено по-разному в направлениях X и Y, хотя это приведет к растяжению. Если вы загружаете текстуру атласа с помощью этой команды, то subimages.txt файл также будет иметь свои значения, измененные таким образом, чтобы LoadSubImage по-прежнему работал правильно. Параметр кэша больше не используется, так как масштабирование изображения теперь выполняется графическим процессором, поэтому почти не влияет на производительность
### Определение
```php
UINT agk::LoadImageResized( const char* szFilename, float scaleX, float scaleY, int cache )
void agk::LoadImageResized( UINT iImageID, const char* szFilename, float scaleX, float scaleY, int cache )
```
### Параметры
```php
szFilename - Имя загружаемого файла
scaleX - Сумма для масштабирования в направлении X, 1.0-это исходный размер
```
### Пример кода
---
## LoadImage
### Описание
Загружает изображение из файла в указанный идентификатор изображения, также может быть использован для загрузки текстуры атласа, которая будет использоваться субизображениями. При загрузке текстуры атласа a subimages.txt файл должен существовать с подробным описанием всех содержащихся в нем изображений. Ширина и высота изображения должны быть от 1 до 2048 пикселей, некоторые устройства могут поддерживать большие размеры, но это не гарантируется. Изображения не должны быть размером в 2 степени (2,4,8,16,32 и т. Д.). Если у вас есть много небольших изображений, вы можете объединить их в текстуру атласа, чтобы повысить производительность.
### Определение
```php
void agk::LoadImage( unsigned int ID, const char *sImageFilename, int bBlackToAlpha )
UINT agk::LoadImage( const char* sImageFilename, int bBlackToAlpha )
UINT agk::LoadImage( const char* sImageFilename )
void agk::LoadImage( UINT ID, const char* sImageFilename )
```
### Параметры
```php
ID - Идентификатор, который будет использоваться для ссылки на это изображение позже.
sImageFilename - Имя файла загружаемого изображения.
bBlackToAlpha - Установите значение 1, чтобы переопределить альфа-канал изображения, чтобы он был прозрачным там, где есть черные пиксели, и непрозрачным в противном случае (по умолчанию 0)
undefined
```
### Пример кода
---
## IsChoosingImage
### Описание
Возвращает 1, если AGK в данный момент отображает экран выбора изображения и ждет, пока пользователь выберет изображение. Когда это возвращает 0, пользователь либо отменил, либо выбрал изображение, проверьте GetChosenImage, чтобы увидеть, каков был результат.
### Определение
```php
UINT agk::IsChoosingImage()
```
### Параметры
```php
undefined
```
### Пример кода
---
## IsCapturingImage
### Описание
Эта функция устарела, вместо нее используйте SetDeviceCameraToImage. Возвращает 1, если AGK в данный момент отображает ленту камеры и ждет, когда пользователь захватит изображение. Когда это возвращает 0, пользователь либо отменил, либо захватил изображение, проверьте GetCapturedImage, чтобы увидеть, каков был результат.
### Определение
```php
UINT agk::IsCapturingImage()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetNumDeviceCameras
### Описание
Возвращает количество камер, доступных для SetDeviceCameraToImage. В настоящее время работает только на Android, iOS и Windows
### Определение
```php
int agk::GetNumDeviceCameras()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetImageWidth
### Описание
Возвращает ширину изображения в пикселях. Даже если эта команда возвращает float, значение гарантированно будет целым числом.
### Определение
```php
float agk::GetImageWidth( unsigned int iImageIndex )
```
### Параметры
```php
iImageIndex - Идентификатор извлекаемого изображения.
```
### Пример кода
---
## GetImageExists
### Описание
Возвращает 1, если изображение существует, и 0, если нет.
### Определение
```php
UINT agk::GetImageExists( UINT iImageIndex )
```
### Параметры
```php
iImageIndex - Идентификатор изображения для проверки
```
### Пример кода
---
## GetImageSizeFromFile
### Описание
Открывает файл изображения для извлечения значений ширины и высоты, а затем немедленно закрывает файл. Это намного быстрее, чем загрузка всего изображения. Это может быть полезно при использовании LoadImageResized, чтобы знать, насколько масштабировать изображение перед его загрузкой. И ширина, и высота будут возвращены в одном целочисленном значении, верхние 16 бит будут шириной, а нижние 16 бит-высотой. Вы можете извлечь эти значения в Tier 1, выполнив width = result >> 16 height = result && 0xFFFF
### Определение
```php
UINT agk::GetImageSizeFromFile( const char* filename )
```
### Параметры
```php
filename - Имя файла изображения для проверки
```
### Пример кода
---
## GetImageFilename
### Описание
Возвращает имя файла, используемого для загрузки этого образа. В tier 2 возвращаемая строка должна быть удалена, когда вы закончите с ней.
### Определение
```php
char* agk::GetImageFilename( UINT imageID )
```
### Параметры
```php
imageID - Идентификатор изображения для проверки.
```
### Пример кода
---
## GetImageHeight
### Описание
Возвращает высоту изображения в пикселях. Даже если эта команда возвращает float, значение гарантированно будет целым числом.
### Определение
```php
float agk::GetImageHeight( unsigned int iImageIndex )
```
### Параметры
```php
iImageIndex - Идентификатор извлекаемого изображения.
```
### Пример кода
---
## GetImage
### Описание
Захватывает часть backbuffer и создает из нее новое изображение. Значения положения и размера должны быть указаны в координатах экрана. Возвращает идентификатор нового изображения, он должен быть удален, когда вы закончите с ним. Чтобы эффективно использовать эту команду, вы должны знать, как AGK обращается к заднему буферу. При вызове синхронизации AGK обновляет позиции всех объектов с помощью Update, затем рисует их все в задний буфер с помощью Render, не очищая его, а затем выводит задний буфер на экран с помощью Swap. Затем он очищает задний буфер и возвращается к вашему коду, так что если бы вы вызвали getImage сразу после синхронизации, то получили бы пустое изображение, заполненное текущим чистым цветом. Поэтому, если вы хотите захватить изображение текущей сцены полностью нарисованной, вы должны вызвать Render, а затем getImage, а затем ClearScreen, чтобы очистить задний буфер, чтобы синхронизация не перерисовывала все по полностью нарисованному буферу глубины. Если вы уже используете Update, Render и Swap вместо Sync, то вызовите getImage между Render и Swap. Это также позволяет вам делать такие вещи, как рисовать линии в заднем буфере, получать изображение результата и затем очищать его, чтобы он не влиял на то, что отображается на экране. Вызов getImage-это медленная команда, и не рекомендуется вызывать ее каждый кадр. Обратите внимание, что изображение, полученное этой командой, не гарантированно будет иметь ту же ширину и высоту, что и заданные этой командой, это происходит потому, что изображение создается из части экрана, которая имеет разный размер на разных устройствах. Например, при виртуальном разрешении 480х360 вы получите изображение во весь экран, вызвав эту команду с шириной 480 и высотой 360, но на iPod это даст изображение 480х360 пикселей, в то время как на iPad оно будет около 1024х768 пикселей. Это не должно влиять на то, как вы используете изображение, поскольку применение его к спрайту и установка размера спрайта на тот же 480x360 заставит спрайт заполнить экран в обоих случаях. Это просто означает, что на iPad у вас есть более качественное изображение для игры. Это также относится к командам рисования линий: рисование линии от 0,0 до 100,100, а затем получение изображения от 0,0 до 100,100 приведет к получению изображения диагональной линии на всех устройствах, но устройства с высоким разрешением экрана будут производить изображение более высокого качества, содержащее больше пикселей. Используйте GetImageWidth и GetImageHeight, если вам нужно знать фактический размер изображения, полученного в пикселях.
### Определение
```php
void agk::GetImage( UINT imageID, float x, float y, float width, float height )
UINT agk::GetImage( float x, float y, float width, float height )
```
### Параметры
```php
imageID - Номер изображения, которое будет содержать захваченное изображение
x - Координата x верхнего левого угла поля для копирования
```
### Пример кода
---
## GetDeviceCameraType
### Описание
Возвращает 1, если данный идентификатор камеры является задней камерой, 2, если это фронтальная камера, или 0, если это неизвестно.
### Определение
```php
int agk::GetDeviceCameraType( UINT cameraID )
```
### Параметры
```php
cameraID - Идентификатор камеры устройства, которую вы хотите проверить
```
### Пример кода
---
## GetChosenImage
### Описание
Возвращает ИДЕНТИФИКАТОР вновь выбранного изображения, выбранного с помощью ShowChooseImageScreen. Если это возвращает 0, то пользователь отменил процесс или вы еще не запустили его с помощью ShowChooseImageScreen. После того как вы вызвали эту команду для получения идентификатора изображения, она будет возвращать 0 до тех пор, пока ShowChooseImageScreen не будет вызван снова.
### Определение
```php
UINT agk::GetChosenImage()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetCapturedImage
### Описание
Эта функция устарела, вместо нее используйте SetDeviceCameraToImage. Возвращает ИДЕНТИФИКАТОР только что захваченного изображения, созданного с помощью ShowImageCaptureScreen. Если это возвращает 0, то пользователь отменил процесс или вы еще не запустили его с помощью ShowImageCaptureScreen. После того как вы вызвали эту команду для получения идентификатора изображения, она будет возвращать 0 до тех пор, пока ShowImageCaptureScreen не будет вызван снова.
### Определение
```php
UINT agk::GetCapturedImage()
```
### Параметры
```php
undefined
```
### Пример кода
---
## EncodeQRCode
### Описание
Кодирует данный текст в QR - код и возвращает новый идентификатор изображения, содержащий этот код. Вы можете выбрать количество исправлений ошибок, включенных в код, чтобы часть QR-кода была повреждена, но все еще была читабельной. Чем выше режим коррекции ошибок, тем больше вероятность того, что поврежденный или скрытый QR-код будет считан правильно, но более высокие режимы коррекции ошибок могут привести к увеличению QR-кода. Уровень 0 по-прежнему обеспечивает минимальный уровень исправления ошибок, а не никакой.
### Определение
```php
UINT agk::EncodeQRCode( const char* text, int errormode )
```
### Параметры
```php
text - Текст для кодирования.
```
### Пример кода
---
## DeleteImage
### Описание
Удалите изображение из глобального хранилища, используя его идентификатор.
### Определение
```php
void agk::DeleteImage( unsigned int iImageIndex )
```
### Параметры
```php
iImageIndex - Идентификатор удаляемого изображения
```
### Пример кода
---
## DeleteAllImages
### Описание
Удаляет все изображения, загруженные LoadImage или LoadSubImage. Это также сбрасывает автоматический идентификатор изображения до 10000.
### Определение
```php
void agk::DeleteAllImages()
```
### Параметры
```php
undefined
```
### Пример кода
---
## DecodeQRCode
### Описание
Попытка декодировать QR - код и вернуть строку, закодированную в нем. Возвращает пустую строку, если он не смог найти QR-код на изображении или не смог его декодировать. Несколько QR-кодов на изображении, скорее всего, приведут к сбою декодирования.
### Определение
```php
char* agk::DecodeQRCode( UINT image )
```
### Параметры
```php
image - Идентификатором изображения, подлежащего декодированию, может быть изображение, снятое с камеры
```
### Пример кода
---
## CreateRenderImage
### Описание
Создает пустое изображение, пригодное для рендеринга, и возвращает идентификатор для ссылки на него. Это можно использовать с SetRenderToImage для рисования вещей на изображениях. Вы можете создавать изображения RGBA для обычного рендеринга или изображения глубины для захвата буфера глубины на устройствах, которые его поддерживают. Вы также можете использовать mipmapping на этом изображении или нет, это переопределяет глобальную команду SetGenerateMipmaps() только для этого изображения, это связано с тем, что mipmaps на визуализированных изображениях могут быть хитом производительности, поэтому их не следует использовать без необходимости. Mip-карты должны быть необходимы только в том случае, если вы собираетесь использовать это изображение для текстурирования объектов в вашей сцене, если вы используете это изображение только для полноэкранных шейдеров, вы не должны использовать mip-карты на нем.
### Определение
```php
UINT agk::CreateRenderImage( UINT width, UINT height, UINT format, UINT mipmap )
void agk::CreateRenderImage( UINT imageID, UINT width, UINT height, UINT format, UINT mipmap )
```
### Параметры
```php
width - Ширина создаваемого изображения
height - Высота создаваемого изображения
```
### Пример кода
---
## CreateImageColor
### Описание
Создает изображение размером 1x1 пиксель заданного цвета. Это может быть использовано для текстурирования любого объекта или спрайта сплошным цветом.
### Определение
```php
void agk::CreateImageColor( UINT imageID, UINT red, UINT green, UINT blue, UINT alpha )
UINT agk::CreateImageColor( UINT red, UINT green, UINT blue, UINT alpha )
```
### Параметры
```php
imageID - Идентификатор изображения, используемый для этого изображения.
red - Красная составляющая изображения (от 0 до 255)
```
### Пример кода
---
## CopyImage
### Описание
Копирует часть данного изображения в новое изображение. Значения x, y, width, height выражены в пикселях и представляют собой часть изображения, которую вы хотите скопировать в новое изображение. Новое изображение будет иметь тот же размер, что и заданные значения ширины и высоты. Если изображение уже существует с заданным новым идентификатором, его необходимо удалить перед вызовом этой команды. Это медленная команда, и ее не следует вызывать каждый кадр.
### Определение
```php
void agk::CopyImage( UINT newImage, UINT fromImage, int x, int y, int width, int height )
UINT agk::CopyImage( UINT fromImage, int x, int y, int width, int height )
```
### Параметры
```php
newImage - Идентификатор создаваемого нового образа, этот образ не должен существовать
fromImage - Идентификатор изображения для копирования
```
### Пример кода
---