# SE-Lab3

# گزارش آزمایش سوم آز نرم‌افزار

۱. اشکال اول کد این بود که موقع قرض دادن کتاب به دانش آموزان، وجود آن دانش آموز را در کتابخانه بررسی نمیکرد
 دو عدد تست برایش نوشتیم که یکی برای حالتی که دانش آموز عضو کتابخانه باشد و دیگری برای حالتی که نباشد. قبل از فیکس کردن این اشکال:(میبینیم که تستی که برای حالت دانش آموز خارج از کتابخانه بوده پاس نشده)

![Screenshot 2024-07-28 195037](https://github.com/user-attachments/assets/6ced207e-dbe6-4311-aaa3-0f2b08eb9469)


حال اشتباه کد را فیکس کردیم:(اولین عبارت شرطی را اضافه کردیم)

![Screenshot 2024-07-28 195136](https://github.com/user-attachments/assets/d8d8e554-bd9e-42ad-be74-7b7c92df9e4f)


و تست را دوباره ران میکنیم:(میبینیم که هردوتست به درستی پاس میشوند)

![Screenshot 2024-07-28 195208](https://github.com/user-attachments/assets/84577a6b-442e-420d-aa58-e3aa60ba40ea)


اشکال دوم کد موقع بازگرداندن کتاب رخ میداد و این است که بعد از بازگرداندن کتاب توسط دانش آموز، آن کتاب از لیست کتابهای دانش آموز حذف نمیشد. برای آن یک تست نوشتیم که قبل از درست کردن اشکال کد، پاس نشود:

![Screenshot 2024-07-28 195243](https://github.com/user-attachments/assets/4d4e8209-3205-4bce-a7d4-230bdfe965f5)


و حالا بعد از درست کردن اشکال کد:(کتاب را از کتابهای دانش آموز حذف کردیم)

![Screenshot 2024-07-28 195322](https://github.com/user-attachments/assets/47cd727d-44fd-4b56-bd86-6cb484e5e2e0)


 تست را اجرا میکنیم:


![Screenshot 2024-07-28 195343](https://github.com/user-attachments/assets/3e510c88-3006-4ae1-83e9-32ed55b0f8b2)


۲. در این آزمایش، قصد داریم به برنامه‌ی library یک سری قابلیت اضافه کنیم و این پیاده سازی را به روش TDD انجام دهیم.
ابتدا برای نیازمندی های مدنظر، یونیت تست می‌نویسیم و برنامه را ران می‌کنیم تا مطمئن شویم تست ها fail می‌شوند.

![Screenshot 2024-07-28 195412](https://github.com/user-attachments/assets/7ae5e119-201f-4e73-85a6-6ee34ef24c2b)




سپس پیاده سازی تابع جستجوی کتاب و جستجوی دانشجو داخل کتابخانه را انجام می‌دهیم.

![Screenshot 2024-07-28 195435](https://github.com/user-attachments/assets/4b96f297-0e0b-47ac-9fbf-4a0d571792d8)

![Screenshot 2024-07-28 195519](https://github.com/user-attachments/assets/bd65cd50-8fbb-49c1-ac22-af38819619e3)



و حال مجدد تست‌های نوشته شده را ران می‌کنیم تا با پاس شدن تمامی تست ها، از صحت عملکرد برنامه مطمئن شویم.



![Screenshot 2024-07-28 195546](https://github.com/user-attachments/assets/d7771c35-726d-44e7-8c4d-1bb75a0f20b8)





پرسش‌ها

# ۱. مقایسه روش تست‌محور (Test-Driven Development یا TDD) با روش تست کردن سنتی می‌تواند به درک بهتری از مزایا و معایب هر یک در نوع پروژه‌های مختلف کمک کند.

## 1. تست‌محور (TDD)
ویژگی‌ها:
چرخه توسعه: نوشتن تست‌های کوچک و سپس کدگذاری برای برآورده کردن این تست‌ها به طور مکرر.
تست‌ها قبل از کد: تست‌ها قبل از نوشتن کد اصلی نوشته می‌شوند.
تکرارپذیری: چرخه‌ی کوتاه و مکرر نوشتن تست، نوشتن کد و بازنگری.

مناسب برای:
پروژه‌های پیچیده و بحرانی: پروژه‌هایی که به دقت و اطمینان بالا نیاز دارند، مانند سیستم‌های مالی یا پزشکی.
پروژه‌های با نیاز به تغییرات مکرر: TDD کمک می‌کند که تغییرات به راحتی اعمال شده و خطاها زودتر شناسایی شوند.
توسعه‌ی سیستم‌های بزرگ و مقیاس‌پذیر: TDD تضمین می‌کند که بخش‌های مختلف سیستم به درستی با هم کار می‌کنند.

مزایا:
کیفیت بالا: کد نوشته شده به طور مداوم تست می‌شود و خطاها زودتر شناسایی و رفع می‌شوند.
مستندات زنده: تست‌ها به عنوان مستندات زنده برای کد عمل می‌کنند و توضیح می‌دهند که کد باید چه کاری انجام دهد.
انعطاف‌پذیری: امکان تغییرات سریع و امن در کد وجود دارد.

معایب:
زمان‌بر بودن: نوشتن تست‌ها قبل از کد ممکن است زمان بیشتری ببرد.
نیاز به مهارت: نیاز به تجربه و دانش بالا در نوشتن تست‌های موثر دارد.

# 2. تست کردن سنتی
ویژگی‌ها:
چرخه توسعه: کد اصلی نوشته می‌شود و سپس تست‌ها برای آن نوشته می‌شوند.
تست‌ها بعد از کد: تست‌ها پس از تکمیل بخش‌های اصلی کد نوشته می‌شوند.
تست‌های بزرگتر: معمولا تست‌های بزرگتر و کلی‌تری نوشته می‌شود.

مناسب برای:
پروژه‌های کوچک و متوسط: پروژه‌هایی که نیاز به توسعه سریع دارند و پیچیدگی کمتری دارند.
پروژه‌های پروتوتایپ و نمونه: پروژه‌هایی که هدف اصلی تولید یک نمونه سریع برای ارزیابی و نمایش است.
پروژه‌هایی با زمان و منابع محدود: پروژه‌هایی که زمان و منابع محدودتری دارند و نیاز به تحویل سریع دارند.

مزایا:
سرعت بالا: امکان تحویل سریع‌تر کد به دلیل نبود نیاز به نوشتن تست‌ها قبل از کد.
سادگی: برای پروژه‌های ساده و کوچک مناسب‌تر است و نیاز به زمان و منابع کمتری دارد.

معایب:
کیفیت پایین‌تر: خطاها ممکن است دیرتر شناسایی شوند و کیفیت نهایی کد پایین‌تر باشد.
مستندسازی کمتر: مستندات کمتری برای کد تولید می‌شود و تست‌ها کمتر به عنوان مستندات عمل می‌کنند.
انعطاف‌پذیری کمتر: اعمال تغییرات در کد ممکن است منجر به ایجاد خطاهای ناخواسته شود.

#### به طور کلی TDD برای پروژه‌های پیچیده، بحرانی، و بزرگ که به کیفیت بالا و تغییرات مکرر نیاز دارند، مناسب‌تر است. در مقابل، روش تست کردن سنتی برای پروژه‌های کوچک‌تر، پروتوتایپ‌ها، و پروژه‌هایی با زمان و منابع محدود مناسب‌تر است. انتخاب بین این دو روش بستگی به نوع پروژه، نیازها و محدودیت‌های موجود دارد.





# ۲. در فرآیند ایجاد نرم‌افزار، تیم توسعه (Development Team) و تیم تضمین کیفیت (QA Team) وظایف متفاوتی در تست نرم‌افزار دارند. هر یک از این تیم‌ها بیشتر با دسته‌های خاصی از انواع تست سروکار دارند. در ادامه، نقش هر تیم و نوع تست‌هایی که معمولاً انجام می‌دهند، توضیح داده شده است.

## تیم توسعه (Development Team):

تست واحد (Unit Testing): تست واحد، کوچک‌ترین واحدهای کد (معمولاً یک تابع یا متد) را به صورت جداگانه تست می‌کند. توسعه‌دهندگان کد را می‌نویسند و مطمئن می‌شوند که هر بخش کوچک از کد به درستی کار می‌کند.

تست یکپارچه‌سازی (Integration Testing): تست یکپارچه‌سازی، تعامل بین واحدهای مختلف کد و ماژول‌ها را بررسی می‌کند. زیرا توسعه‌دهندگان نیاز دارند اطمینان حاصل کنند که ماژول‌های مختلف نرم‌افزار به درستی با هم تعامل دارند و داده‌ها به درستی بین آن‌ها جریان دارد.

تست سیستم (System Testing): تست سیستم، کل سیستم نرم‌افزاری را به عنوان یک کل یکپارچه بررسی می‌کند. زیرا توسعه‌دهندگان می‌خواهند مطمئن شوند که نرم‌افزار به عنوان یک سیستم کامل به درستی کار می‌کند.

تست component test: مشابه integration test ولی در سطوح کلاسها ماژولها و سرویسها به صورت ایزوله.

تست mock test: ایجاد اشیای mock برای شبیه سازی وابستگی هایی که براحتی قابل تست نیستند مثل دیتابیس و سرویسهای خارجی و ... .


## تیم تضمین کیفیت (QA Team):

تست پذیرش (Acceptance Testing): تست پذیرش، نرم‌افزار را از دیدگاه کاربر نهایی بررسی می‌کند تا اطمینان حاصل شود که نرم‌افزار نیازهای کاربر را برآورده می‌کند. تیم QA باید اطمینان حاصل کند که نرم‌افزار مورد قبول مشتری است و تمامی نیازهای مشخص شده را برآورده می‌کند.

تست عملکرد (Performance Testing): تست عملکرد، کارایی نرم‌افزار را تحت شرایط مختلف بارگذاری و استفاده بررسی می‌کند. تیم QA باید اطمینان حاصل کند که نرم‌افزار تحت فشار کاری سنگین به درستی کار می‌کند و معیارهای عملکردی را رعایت می‌کند.

تست بار (Load Testing): تست بار، نحوه عملکرد نرم‌افزار تحت بارهای سنگین و تعداد زیادی از کاربران همزمان را بررسی می‌کند. تیم QA به این تست نیاز دارد تا از پایداری نرم‌افزار در شرایط واقعی و بارهای بالا اطمینان حاصل کند.

تست استرس (Stress Testing): تست استرس، نرم‌افزار را تحت شرایطی فراتر از ظرفیت عادی آن بررسی می‌کند تا نقطه شکست را بیابد. تیم QA به این تست نیاز دارد تا ببیند نرم‌افزار چگونه در شرایط بحرانی عمل می‌کند و نقاط ضعف آن کجاست.

تست امنیت (Security Testing): تست امنیت، آسیب‌پذیری‌های نرم‌افزار را در برابر تهدیدات امنیتی بررسی می‌کند. تیم QA باید مطمئن شود که نرم‌افزار در برابر حملات و تهدیدات امنیتی مقاوم است و داده‌ها به صورت ایمن مدیریت می‌شوند.

تست کاربردپذیری (Usability Testing): تست کاربردپذیری، بررسی می‌کند که نرم‌افزار چقدر برای کاربران نهایی قابل استفاده و مفید است. تیم QA باید مطمئن شود که نرم‌افزار تجربه کاربری خوبی ارائه می‌دهد و کاربران به راحتی می‌توانند با آن تعامل کنند.

تست user interface (UI): به منظور شبیه سازی تعامل کاربر با عناصر موجود در اپلیکیشن استفاده می‌شود تا تجزیه کاربر از GUI را بسنجند.




۳. نتایج به شکل زیر میباشد:


![Screenshot 2024-07-28 195649](https://github.com/user-attachments/assets/0cefad8f-b92a-472a-9524-97af95404084)

![Screenshot 2024-07-28 195921](https://github.com/user-attachments/assets/cec69a18-181a-4ac2-888d-c75ba3219b5a)

![Screenshot 2024-07-28 195927](https://github.com/user-attachments/assets/07f55f39-3b54-426b-ac8c-7c5b6c94fe35)

![Screenshot 2024-07-28 195937](https://github.com/user-attachments/assets/89d7a07e-5798-418d-be61-3e7fd53783aa)



۴. بعد از افزودن تست های بیشتر نتایج به شکل زیر افزایش پیدا کردند:

![Screenshot 2024-07-28 200040](https://github.com/user-attachments/assets/22261f69-5237-445f-be1a-50e47f5befb4)

![Screenshot 2024-07-28 200053](https://github.com/user-attachments/assets/b47c07e9-8556-4ec6-b4f0-b061421ce957)







